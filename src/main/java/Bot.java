import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        SendMessage sendMessage=new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId().toString());
        String id= String.valueOf(update.getMessage().getAudio().getFileId());
        sendMessage.setText(id);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String getBotToken(){
        return "6235612239:AAEO6orjYtMrB-C0PyYYKCoEVyw402jjxGY";
    }

    @Override
    public String getBotUsername() {
        return "max_music_tg_bot";
    }
}
