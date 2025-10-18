package application.repositories;

import application.utils.FileUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Данный репозиторий реализован с применением паттерна <b><a href="https://refactoring.guru/ru/design-patterns/singleton">Singleton (одиночка)</a></b>.
 * <br>
 * Это означает, что в приложении существует только один экземпляр этого класса.
 * <br>
 * Такой подход позволяет избежать многократного создания объекта в памяти и обеспечивает централизованный доступ к репозиторию без лишней нагрузки на систему.
 * <br>
 * <br>
 * Создание объекта происходит не через <i>new</i>, а через <i>SpaceStationRepository.getInstance()</i>;
 */
public class JSONRepository
{
    private static final JSONRepository INSTANCE = new JSONRepository();

    private final FileUtils utils = new FileUtils();
    private final Gson gson = new GsonBuilder()
                                                .setPrettyPrinting()
                                                .create();


    private JSONRepository() {}

    public static JSONRepository getInstance() {
        return INSTANCE;
    }


    public <T> T get(Type type, String path) throws IOException {
        String data = utils.read(path);
        return gson.fromJson(data, type);
    }

    public <T> void save(T data, String path) throws IOException {
        String json = gson.toJson(data);
        utils.write(path, json);
    }
}
