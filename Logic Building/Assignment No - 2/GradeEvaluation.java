class GradeEvaluation {
    public static void main(String[] args) {
        int maths = 80;
        int science = 85;
        int history = 90;

        double average = (maths + science + history) / 3.0;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else if (average >= 30) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Fail");
        }
    }
}
}