import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class preciocohesbot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());

        String command = update.getMessage().getText();
        SendMessage message = new SendMessage().setChatId(update.getMessage().getChatId());

        if (command.equals("/hola")){
            message.setText("Bienvenido " + update.getMessage().getFrom().getFirstName());
        }

        if (command.equals("hola")){

            System.out.println("Se ha generado un mensaje: 'Bienvenido su nombre es :" + update.getMessage().getFrom().getFirstName()+ "'");
            message.setText("Bienvenido su nombre es :" + update.getMessage().getFrom().getFirstName());

        }
        if (command.equals("/ejecutar")){


            System.out.println("Se ha generado un mensaje 'hola'");
            message.setText(("Hola, este bot te permite ver el precio de coches, elige una marca indicando su numero: " +
                    "\n\n-1-Audi\n-2-AlfaRomeo\n-3-BWM\n-4-Ferrari"));
            System.out.println("Se ha generado : Hola, este bot te permite ver el precio de coches, elige una marca indicando su numero..");



            if (command.equals(1)) {
                message.setText(("Escriba el modelo:"));
                message.setText("elija en numero de opción");
                message.setText("1- A1\n2-A1 Sportback\n3-A2");
            } else if (command.equals(2)) {
                message.setText(("Escriba el modelo:"));
                message.setText("elija en numero de opción");
                message.setText("1- Julieta\n2-Veloce");
            } else if (command.equals(3)){
                message.setText(("Escriba el modelo:"));
                message.setText("elija en numero de opción");
                message.setText("1- M1\n2-M2\n3-M3");
            } else if (command.equals(4)){
                message.setText(("Escriba el modelo:"));
                message.setText("elija en numero de opción");
                message.setText("1- LaFerrari\n2-488\n3-Berlinetta");
            } else {
                message.setText("Vuelva a escribir la marca");
            }
        }
        message.setChatId(update.getMessage().getText());
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String getBotUsername() {
        return "preciocohesbot";
    }

    public String getBotToken() {
        return "1200024168:AAEyYKQT8Iek2lXpgbHF6_zSI9qdhWAVtBM";
    }
}
