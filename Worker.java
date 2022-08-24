package worker;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Задача № " + i + " успешно выполнена ");
            if (i == 33){
                errorCallback.onError("Неизвестная ошибка на "+ i + " задаче!");
            }
        }
    }
}

