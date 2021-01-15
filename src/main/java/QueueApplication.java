import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import telegram.Bot;

import java.util.Map;

public class QueueApplication {

    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new Bot("IraCosQueueBot","1533398537:AAHc_MCgxe5jwN6Q_lI0jyuYn2GFMv-WCfw"));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

