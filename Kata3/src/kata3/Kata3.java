package kata3;

public class Kata3 {

   
    public static void main(String[] args) {
       
        //MODEL
        Histogram<String> histogram = new Histogram<String>();
       
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("gmail.es");
       
        //VIEW
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM DISPLAY", histogram);
        histogramDisplay.execute();
       
    }
   
}
