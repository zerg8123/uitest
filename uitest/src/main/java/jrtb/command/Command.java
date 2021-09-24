package jrtb.command;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface Command {

    void execut(Update update);
}
