public class Film {
    String name;
    int yearOfRelease;
    boolean includedInThePlan;
    double sumOfEvaluation;
    int totalRatings;
    int durationInMinutes;

    //Metodo
    void displayTechnicalSpecifications() {
        // Exibe informações da instância criada
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearOfRelease);
        System.out.println("Duração em minutos: " + durationInMinutes);
        System.out.println("Incluído no plano: " + includedInThePlan);
    }
    void evaluate(double note){
        sumOfEvaluation += note;
        totalRatings++;
    }
    double getMedia(){
        return sumOfEvaluation / totalRatings;
    }

}