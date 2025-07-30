package application;

import model.config.WeekDays;
import model.security.User;
import model.security.UserRole;

public class App {
    public static void main(String[] args) throws Exception {
        demoUser();
        demoWeekDays();
    }

    //Metodo pa enseyar dias con enums
        private static void demoWeekDays() {
            //Llamado del enum instanciando directo
            WeekDays day = null;
            day = WeekDays.FRIDAY;
            System.out.println(day);
            System.out.println(day.getNumb());

            //Llamado del enum con var
            var appointmentDay = WeekDays.FRIDAY;
            System.out.println(appointmentDay);

    }

        private static void demoUser(){
            var cesar = new model.security.User("Cesar", "cesar@gmail.com", "121234432", true, UserRole.ADMIN);
            var jose = new model.security.User ("Jose", "joser@gmail.com", "1123123");
            var userArray = new User[] { cesar, jose };

            for (int i = 0; i < userArray.length; i++) {
                var user = userArray[i];
                switch (user.getRole()) {
                    case ADMIN:
                    System.out.printf("%s es el superusuario%n", user);
                    break;

                    case CLIENT:
                    System.out.printf("%s es el cliente%n", user);
                    break;

                    case PROVIDER:
                    System.out.printf("%s es el proveedor%n", user);
                    break;

                    case USER:
                    System.out.printf("%s quien es diego sniper?%n", user);
                    break;

                    case EMPLOYEE:
                    System.out.printf("%s es el subordinado%n", user);
                        break;
                
                    default:
                    System.out.println("hable bien");
                        break;
                }
            }
        }
    }



