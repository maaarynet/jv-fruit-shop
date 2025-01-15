package core.basesyntax.operation;

import core.basesyntax.FruitTransaction;
import core.basesyntax.Storage;

public class BalanceOperation implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction, Storage storage) {
        storage.balance(transaction.getFruit(), transaction.getQuantity());
    }
}
