package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Привет, Бот."),
                is("Привет, кожаные ублюдки.")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Пока."),
                is("Пока, кожаные ублюдки!")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("Сколько будет 2 + 2?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}