
import java.util.ArrayList;
import java.util.Collections;

public class Statistics {
    private ArrayList<Integer> grades;

    public Statistics(ArrayList<Integer> grades) {
        this.grades = grades;
    }
    
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    

    public double pointAverages(){
        int sum = 0;
        
        for(int g: grades) {
                sum += g;
        }
        return 1.0 * sum / grades.size();
    }
    
    public double pointAveragesPassing(){
        int sum = 0;
        int count = 0;
        for(int g: grades) {
            if (g >= 50) {
                sum += g;
                count++;
            }
        }
        return 1.0 * sum / count;
    }
    
    public double passPercentage(){
        int passers = 0;
        
        for(int g: grades){
            if (g >= 50) {
                passers++;
            }
        }
        return passers * 1.0 * 100/grades.size();
    }
    
    public int[] gradeDis(){
        
        Collections.sort(grades);
        int[] grade = new int[6];
        
        grades.forEach((g) -> {
            if(g < 50) {
                grade[0] += 1;
            } else if (g >= 50 && g < 60) {
                grade[1] += 1;
            } else if (g >= 60 && g < 70) {
                grade[2] += 1;
            } else if (g >= 70 && g < 80) {
                grade[3] += 1;
            } else if (g >= 80 && g < 90) {
                grade[4] += 1;
            } else if (g >= 90 && g <= 100) {
                grade[5] += 1;
            }
        });
        
        return grade;
    
    }   
    
}
