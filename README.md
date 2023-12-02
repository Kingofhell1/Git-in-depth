### Урок 1(Семинар)
* Выберите какой-нибудь проект на изучаемом вами языке программирования, с которым вы будете тренироваться работать в Git, и инициализируйте в папке этого проекта локальный репозиторий. Сами команды:
    * git init
    * git add filename
    * git commit -m "Comment"
    * git remote add origin idgithubfile
    * git push -u origin main
* Создайте непустой удалённый репозиторий (например, с файлом README.md) с именем, соответствующим имени этого проекта.
Подключите свой проект к этому удалённому репозиторию и отправьте в него код этого проекта. Самостоятельно разрешите конфликты и проблемы, если они возникнут при выполнении данного задания. 
    Если есть конфилкты то необходимо с начало сделать **git pull** из удаленного репозитория в локальный, чтобы файлы которые назодятся на удаленке перешли на локалку, после только **push**
-----------
### Урок 2(Семинар)
Данное домашнее задание является продолжением домашнего задания, которое вы выполняли на предыдущем семинаре в репозитории с собственным проектом.

1. Просмотрите историю коммитов в своём проекте и выберите три случайных коммита. Просмотрите изменения, которые были в них сделаны.
    Для просмотра истории используется команда **git log**
![picture](images/1.png)
2. Верните эти изменения командой git revert последовательно, чтобы в итоге получилось тоже три коммита.
![picture1](images/8.png)
![picture2](images/5.png)
3. Попробуйте отменить эти три коммита:
* последний — командами git reset --soft и git restore;
![pucture3](images/2.png)
![picture4](images/3.png)
* предпоследний — командой git reset --mixed и git restore;
![picture5](images/6.png)
* первый — командой git reset --hard.
![picture6](images/7.png)
-------
Сам код - это игра камень, ножницы, бумага.

Подготовил студент GeekBrains Черняков Дмитрий, Git-in-depth