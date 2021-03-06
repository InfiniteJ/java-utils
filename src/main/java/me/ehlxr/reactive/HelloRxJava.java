package me.ehlxr.reactive;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by lixiangrong on 2018/1/16.
 */
public class HelloRxJava {

    public static void main(String[] args) {
        hello("wer", "wd");
    }

    private static void hello(String... names) {
        Observable.from(names).subscribe(new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("Completed!");
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onNext(String strings) {
                System.out.println("same hello " + strings);
            }

        });
    }
}
