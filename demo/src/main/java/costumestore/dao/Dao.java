package costumestore.dao;

public interface Dao<T> {
    T SelectByCondition(T input);
}