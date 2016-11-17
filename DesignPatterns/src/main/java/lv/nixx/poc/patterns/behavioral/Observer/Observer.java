package lv.nixx.poc.patterns.behavioral.Observer;

/*
 * Наблюдатель (англ. Observer) — поведенческий шаблон проектирования. Также известен как «подчинённые» (Dependents). 
 * Создает механизм у класса, который позволяет получать экземпляру объекта этого класса оповещения от других 
 * объектов об изменении их состояния, тем самым наблюдая за ними.
 */
public interface Observer {
    void update (float temperature, float humidity, int pressure);
}
