# Банковский счёт

Предположим, мы получили задачу создать программу, которая будет отслеживать все счета в банке. 

Банк поддерживает несколько различных типов счетов:

*	Обычный счет - с этого счета взимается плата за обслуживание счета, которая составляет наименьшее из двух значений: 100 руб. или 10% от остатка на конец месяца. Существует штраф 100.00 руб., если баланс падает ниже минимума - 5000,00 руб.
*	Счет продвинутый -  с этого счета взимается плата за обслуживание, которая составляет наименьшее из двух значений: 100 руб. или 10% от остатка на конец месяца. Кэшбек на все операции оплаты 1%, но не более 100 рублей, которые зачисляются на счет сразу после совершения операции оплаты. Требования минимального баланса отсутствуют. 
*	Счет молодежный -  плата за обслуживание по счету отсутствует. Кэшбек 2%, которые зачисляются на счет сразу после совершения операции оплаты. Существует штраф 300.00 руб, если не было операций оплаты в течении месяца, снимается в конце месяца. За каждую операцию снятия денег взимается комиссия в размере 10 рублей.

Каждый из счетов защищен ПИН-кодом, который должен храниться в виде хеш-кода и требоваться для совершения следующих операций:
*	Запрос баланса
*	Снятие наличных
*	Оплата
*	Пополнение счета
*	Детализация по счету

## Атрибуты и методы

Каждый счет должен иметь следующий минимальный набор данных:
*	ФИО владельца счета
*	баланс
*   пин-код
*	количество месяцев с открытия счета
*   комиссии, штрафы и иные условия по счету
*	все виды счетов должны реализовывать минимальный набор операций:
    +	открытие счета; 
    +	пополнение счета;
    +	операция снятия денег;
    +	запрос баланса;
    +	операция оплаты со счета, с указанием суммы, и названия магазина;
    +	получение информации о владельце;
    +	расчет комиссий и штрафов (при выполнении данной операции, считать, что месяц закончен);
    +	вывод детализированной информации по счету (постарайтесь максимально чётко детализировать).
Операции указанные выше, должны быть защищены проверкой ПИН-кода

Реализовать классы, а также реализовать программу, демонстрирующую работу с каждым видом счета, 
показывающую корректность расчета комиссий, штрафов, начислений и т.д. Также необходимо комментировать код. 

Комментарии должны аргументировано показывать логику вашего проектного решения.
