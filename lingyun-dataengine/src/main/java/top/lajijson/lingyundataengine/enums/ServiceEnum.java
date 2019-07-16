package top.lajijson.lingyundataengine.enums;

import lombok.Getter;

public class ServiceEnum {

    @Getter
    public enum Item {
        DATA_SOURCE_1("datasource1");

        Item(String name) {
            this.name = name;
        }

        private String name;
    }

}
