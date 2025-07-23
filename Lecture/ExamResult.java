interface Exam {
    public boolean pass(int mark);
}

interface Classify {
    public String Division(int avg);
}

class Result implements Exam, Classify {
    public boolean pass(int mark) {
        return mark >= 50;
    }

    public String Division(int avg) {
        if (avg >= 60) {
            return "First Division";
        } else if (avg >= 50 && avg < 60) {
            return "Second Division";
        } else{
            return "No division";
        }
    }
}

public class ExamResult {
    public static void main(String[] args) {
        Result result = new Result();
        int mark = 75;
        int avg = 65;

        System.out.println("Pass Status: " + result.pass(mark));
        System.out.println("Division: " + result.Division(avg));
    }
}