package us.codecraft.tinyioc;

import javax.sound.midi.SoundbankResource;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldService {

    public HelloWorldService() {
        System.out.println("init");
    }

    private String text;

    private OutputService outputService;

    public void helloWorld(){
        outputService.output(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
