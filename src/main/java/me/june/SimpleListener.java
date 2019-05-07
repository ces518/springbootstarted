package me.june;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-05-07
 * Time: 21:28
 **/

/**
 * 애플리케이션 리스너 등록
 *
 */
@Component
//public class SimpleListener implements ApplicationListener<ApplicationStartingEvent> {
public class SimpleListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
//    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("app is started !!");
    }
}
