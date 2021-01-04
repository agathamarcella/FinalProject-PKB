package weka.classifiers.functions;

import weka.classifiers.AbstractClassifier;
import weka.core.*;

import java.util.*;

public class ROCK extends AbstractClassifier implements OptionHandler {
/* @Override
    public Distance calculateDistance(Collection<Distance> distances) {
        double sum = 0;
        double result;

        for (Distance dist : distances) {
            sum += dist.getDistance();
        }
        if (distances.size() > 0) {
            result = sum / distances.size();
        } else {
            result = 0.0;
        }
        return  new Distance(result);
    }
*/

/* Calculate the similarity between two clusters according to the goodness measure formula
 g(Ci, Cj) = [link(Ci, Cj)] / [(ni + nj)^(1+2f(theta)) - (ni)^(1+2f(theta)) */
    private class CalcGoodness() {

        private int Link;
        private int Cluster;
        private int i;
        private int j;
    }
}