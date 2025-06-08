# Используем официальный образ OpenJDK
FROM openjdk:17-jdk-alpine

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем исходные файлы в контейнер
COPY src /app/src

# Компилируем Java файлы
RUN javac -sourcepath ./src -d out ./src/Mainfourth.java 

# Указываем команду для запуска приложения
CMD ["java", "javac /Mainfourth.java"]
