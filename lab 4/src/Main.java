import java.util.Scanner;
public class Main {
    public static int actions;
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        DadaWeather weatherDate = new DadaWeather();
        Display display = new Display();
        while (true){
            System.out.println("Enter humidity - 1");
            System.out.println("Enter temperature - 2");
            System.out.println("Enter pressure - 3");
            System.out.println("Subscribe - 4");
            System.out.println("Unsubscribe - 5");
            System.out.println("Exit - 6");
            System.out.print("Choose actions: ");
            actions = scanner.nextInt();

            
            
if (actions == 1){
System.out.print("Enter humidity: ");
 int humidity = scanner.nextInt();
weatherDate.setHumidity(humidity);
            }
            else if (actions == 2){
                System.out.print("Enter temperature: ");
                int temperature = scanner.nextInt();
                weatherDate.setTemperature(temperature);
            }
            else if (actions == 3){
                System.out.print("Enter pressure: ");
                int pressure = scanner.nextInt();
            weatherDate.setPressure(pressure);
            }
            else if (actions == 4){
                weatherDate.subscribe(display);
            }
            else if (actions == 5){
                weatherDate.unsubscribe(display);
            }
            else if (actions == 6){
                break;
            }
            else
                System.out.println("Error. Choose another actions: ");
        }
    }
}
