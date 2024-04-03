
public class Worker {
        private OnTaskDoneListener callback;
        private OnTaskErrorListener errorCallback;

        public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
            this.callback = callback;
            this.errorCallback = errorCallback;
        }

        public void start() {
            final int errorNum = 33;
            for (int i = 0; i < 100; i++) {
                if (i == errorNum) {
                    errorCallback.onError("Task " + i + " with an error");
                } else callback.onDone("Task " + i + " is done");
            }
        }
    }

