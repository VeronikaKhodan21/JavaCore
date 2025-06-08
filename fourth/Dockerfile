# Используем официальный образ OpenJDK
FROM openjdk:11

# Устанавливаем рабочую директорию
WORKDIR /app
# Копируем исходные файлы в контейнер
COPY src /app/src

RUN mkdir -p /app/out
# Компилируем Java файлы
RUN javac -d . src/*.java 
# Указываем команду для запуска приложения
CMD [ "java","Fourth"]
