# Практическая работа 2 
## Выполнила: Клишенкова Алина Игоревна, БСБО-06-23
Был создан модуль ActivityLifecycle. В данном модуле переопредилили основные методы жизненного цикла родительского класса, добавили в разметку "activity_main.xml" поле текстового ввода "EditText" и реализовали отображение "activity", используя класс "Log". Также добавили в каждый метод жизненного цикла сообщение, содержащее сообщение имя метода. Далее запустили проект. 

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5438293393152272662%20(2).jpg)

Вопросы: 
1. Будет ли вызван onCreate() после нажатия «Home» и возврата? - Нет, только если система выгрузит Activity из памяти. 

2. Сохранится ли значение EditText после нажатия «Home» и возврата? - Нет, не сохранится 

3. Сохранится ли значение EditText после нажатия «Back» и повторного запуска? - Нет, Activity уничтожается, и данные сбрасываются.

Создали модуль MultyActivity, добавили кнопку и реализовали обработчик. Добавили "TextView" и инициализировали вызов:

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5438293393152272713.jpg) 

Сделали передачу данных из одной акивити в другую:

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5438293393152272714.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5438119404027115347.jpg) 

Создали модуль IntentFilter. Добавили кнопку "Открыть саайт" и обработчик для вызова веб-браузера, также добавили кнопку для передачи ФИО и университета:

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5438293393152272723.jpg) 

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5438293393152272724.jpg) 

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5438293393152272725.jpg) 

Создали модуль ToastApp, добавили поле ввода и кнопку "Посчитать символы":

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029520.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029521.jpg)

Создали модуль NotificationApp, добавили кнопку "SEND NOTIFICATION" и реализовали ее:

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029592.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029647.jpg)

Создали модуль Dialog, сделали класс AlertDialogFragment и добавили кнопку "Show Dialog" и добаввили передачу данных в активити из диалога, сделав 3 метода:

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029692.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029693.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029701.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029702.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029703.jpg)

Выполнили самостоятельную работу, создали 3 класса и сконструировали диалоговые окна, добвили 3 кнопки и реализовали вызов данных:

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029710.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029712.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029713.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029714.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029716.jpg)

![](https://github.com/alinaklishenkova/Lesson2/blob/master/screenshots/5440787484956029720.jpg)
