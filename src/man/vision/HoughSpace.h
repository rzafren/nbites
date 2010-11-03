#ifndef HoughSpace_h_DEFINED
#define HoughSpace_h_DEFINED

#include <list>
#include <boost/shared_ptr.hpp>

#include "Gradient.h"
#include "geom/HoughLine.h"


/**
 * The accumulator space and associated functions for performing
 * the Hough Transform on a given set of gradient edge points.
 *
 * Returns the lines found in the image.
 */
class HoughSpace
{
public:
    HoughSpace();
    virtual ~HoughSpace() { };

    std::list<HoughLine> findLines(boost::shared_ptr<Gradient> g);

private:                        // Member functions
    void markEdges(boost::shared_ptr<Gradient> g);
    void edge(int x, int y, int t0, int t1);
    int getR(int x, int y, int t);


    void smooth();
    std::list<HoughLine> peaks();
    void suppress(int x0, int y0, std::list<HoughLine>& lines);

    void reset();

    void setAcceptThreshold(int t) { acceptThreshold = t;    }
    int  getAcceptThreshold()      { return acceptThreshold; }

    void setAngleSpread(int t) { angleSpread = t;    }
    int  getAngleSpread()      { return angleSpread; }

private:       // Member variables
    // Hough Space size parameters
    // 256 for full 8 bit angle, width is for 320x240 image
    const static int R_SPAN = 400, T_SPAN  = 256;
    const static int DEFAULT_ACCEPT_THRESH = 90;
    const static int DEFAULT_ANGLE_SPREAD  = 5;
    const static int PEAK_POINTS = 4;

    int acceptThreshold, angleSpread;

    // allocate an extra T for the smoothing neighborhood
    int hs[R_SPAN][T_SPAN + 1];
    bool peak[R_SPAN][T_SPAN];


    const static int drTab[PEAK_POINTS];
    const static int dtTab[PEAK_POINTS];

};

#endif /* HoughSpace_h_DEFINED */
