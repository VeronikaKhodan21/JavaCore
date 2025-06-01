FROM bellsoft/liberica-openjdk-alpine:11

# Копируем исходный код в контейнер
COPY ./src /usr/app/src

# Создаем директории для выходных файлов и документации
RUN mkdir -p /usr/app/out /usr/app/doc

# Компилируем исходный код и создаем javadoc
RUN javac -d /usr/app/out /usr/app/src/com/regular/*.java /usr/app/src/com/simple/*.java \
    && javadoc -d /usr/app/doc /usr/app/src/com/regular/*.java /usr/app/src/com/simple/*.java

# Устанавливаем рабочую директорию
WORKDIR /usr/app

# Запускаем Java приложение и открываем страницу javadoc в браузере
CMD ["sh", "-c", "java -classpath /usr/app/out com.simple.Main && cat /usr/app/doc/index-all.html"]