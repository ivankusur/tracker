package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу простейшей банковской системы,данный сервис позволяет:
 * 1. Регистрировать пользователя.
 * 2. Удалять пользователя из системы.
 * 3. Добавлять пользователю банковский счет. У пользователя системы могут быть несколько счетов.
 * 4. Переводить деньги с одного банковского счета на другой счет.
 * @author IVAN KUSURHASHEV
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение данных о клиентах и их счетах, осществляется в коллекции MAP
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает клиента(user) на вход и добавляет в хранилище, если такой клиент остутствует
     * @param user клиент который добавляется в хранилище клиенотов
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает банковский счет(account) и пасспорт клиента(passport) на вход
     * и добавляет в банковский соотсветствующему клиенту, если такой клиент существует
     * и у него остутствует данный счет
     * @param passport паспорт клиента, по которому проверяется, существование данного
     *  клиета в хранилище
     * @param account банковский счет, который добавляется соотсветствующему клиенту,
     *  если у него остутствует данный счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    /**
     * Метод находит соотвутствуещего клиента, по паспорту(passport)
     * @param passport паспорт клиента, по которому производится поиск соотвутствуещего клиента
     * @return возвращает клиента, по соотвутствию с паспортом
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод находит соотвутствующий банковский счет по реквезитам,
     * принимая на вход паспорт клиента,
     * по которому производится поиск соотвутствуещего клиента и реквизиты
     * по которым производится поиск соответствующего банковского счета
     * @param passport паспорт клиента, по которому производится поиск соотвутствуещего клиента
     * @param requisite реквизиты по которым производится поиск соответствующего
     *                  банковского счета клиента
     * @return возвращает банковский счет, по соотвутствию с паспортом и реквизитами
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account account : list) {
                if (account.getRequisite().equals(requisite)) {
                    rsl = account;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод производит перевод денег с  банковского счета отправителя на счет получателя,
     * при условии существования счета отправителя и получателя и достаточной суммы средств
     * на счете отправителя. Принимает на вхох паспорт клиента отправителя(),
     * паспорт клиента получателя(), реквизиты банковского счета отправителя(),
     * реквизиты банковского счета получателя(), сумму которую необходимо перевести
     * @param srcPassport паспорт клиента отправителя
     * @param srcRequisite реквизиты банковского счета отправителя
     * @param destPassport паспорт клиента получателя
     * @param destRequisite реквизиты банковского счета получателя
     * @param amount денежная сумма перевода
     * @return возвращает true, если перевод успешен и false если перевод неудачнынй
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount && destAccount != null) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
