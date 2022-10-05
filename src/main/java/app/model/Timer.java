package app.model;


import org.springframework.stereotype.Component;

@Component("timer")
public class Timer {
    @Override
    public String toString() {
        return "Timer{" +
                "nanoTime=" + nanoTime +
                '}';
    }



    public void setNanoTime(Long nanoTime) {
        this.nanoTime = nanoTime;
    }

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
