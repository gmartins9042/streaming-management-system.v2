package br.com.alura.streaming.models;

public class Film {
    private String name;
    private int yearOfRelease;
    private boolean includedInThePlan;
    private double sumOfEvaluation;
    private int totalRatings;
    private int durationInMinutes;

    public void displayTechnicalSpecifications() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearOfRelease);
        System.out.println("Duração em minutos: " + durationInMinutes);
        System.out.println("Incluído no plano: " + includedInThePlan);
    }

    public void evaluate(double note){
        sumOfEvaluation += note;
        totalRatings++;
    }

    public double getMedia(){
        return sumOfEvaluation / totalRatings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public boolean getIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalRatings(){
        return totalRatings;
    }
}