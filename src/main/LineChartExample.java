package main;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;  
      
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;  
import org.jfree.data.category.DefaultCategoryDataset;  
      
public class LineChartExample extends JFrame {  
      
      private static final long serialVersionUID = 1L;  
      
      public LineChartExample(String title) {  
        super(title);  
        // Create dataset  
        DefaultCategoryDataset dataset = createDataset();  
        // Create chart  
        JFreeChart chart = ChartFactory.createLineChart(  
            "Site Traffic", // Chart title  
            "Date", // X-Axis Label  
            "Number of Visitor", // Y-Axis Label  
            dataset  
            );  
      
        File f = new File("exportedCharts/temp.jpeg");
        try {
			ChartUtilities.saveChartAsJPEG(f, chart, 600, 400);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ChartPanel panel = new ChartPanel(chart);  
        
        setContentPane(panel);
        
        this.setAlwaysOnTop(true);  
        //this.pack();  
        this.setSize(600, 400);  
        this.setVisible(true); 
      }  
      
      private DefaultCategoryDataset createDataset() {  
      
        String series1 = "Visitor";  
        String series2 = "Unique Visitor";  
      
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
      
        dataset.addValue(200, series1, "2016-12-19");  
        dataset.addValue(150, series1, "2016-12-20");  
        dataset.addValue(100, series1, "2016-12-21");  
        dataset.addValue(210, series1, "2016-12-22");  
        dataset.addValue(240, series1, "2016-12-23");  
        dataset.addValue(195, series1, "2016-12-24");  
        dataset.addValue(245, series1, "2016-12-25");  
      
        dataset.addValue(150, series2, "2016-12-19");  
        dataset.addValue(130, series2, "2016-12-20");  
        dataset.addValue(95, series2, "2016-12-21");  
        dataset.addValue(195, series2, "2016-12-22");  
        dataset.addValue(200, series2, "2016-12-23");  
        dataset.addValue(180, series2, "2016-12-24");  
        dataset.addValue(230, series2, "2016-12-25");  
      
        return dataset;  
      }  
      
}  

