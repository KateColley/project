package com.sda.weather;

import java.util.Scanner;

public class UserInterface {

    public void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome user. Here you can add location");

        while (true) {

            System.out.println("1 - Add new location");
            System.out.println("2 - Show all location");
            System.out.println("Download current weather");
            System.out.println("Exit function");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addLocation();
                    break;

                case 2:
                    showLocation();
                    break;

                case 3:
                    downloadWeather();
                    break;

                default:
                    System.out.println("Dont exist");

            }


            private void createLocation () {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the name of the town: ");
                String name = scanner.nextLine();
                System.out.println("Enter region: ");
                String region = scanner.nextLine();
                System.out.println("Enter country: ");
                String country = scanner.nextLine();
                System.out.println("Enter the longitude: ");
                Double longitude = scanner.nextDouble();
                System.out.println("Enter your latitude: ");
                Double latitude = scanner.nextDouble();
            }

            private void showLocations () {
                System.out.println("Currently added locations: ");
            }

            private void downloadWeatherData () {
                System.out.println("Current weather values: ");
            }
        }
    }
}



