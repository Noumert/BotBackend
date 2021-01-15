package telegram.nonCommand;


import exceptions.IllegalSettingExeption;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.bots.AbsSender;
import telegram.commands.service.ServiceCommand;
import telegram.Bot;

/**
 * Обработка сообщения, не являющегося командой (т.е. обычного текста не начинающегося с "/")
 */
public class NonCommand{

    public NonCommand(){

    }


    public String executeNonCommand(Long chatId, String userName, String text) {
        String answer = "Why you send it to me : \"" + text + "\" ?";
        return answer;
    }
}