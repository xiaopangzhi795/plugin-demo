/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */

package com.geek45.plugin.constant;

/**
 * @ClassName: GeneratorEnums
 * @Decription:
 * @Author: rubik
 *  rubik create GeneratorEnums.java of 2022/6/26 21:24
 */
public enum GeneratorEnums {

    MAPPER("mapper"),
    ENTITY("entity(DO)"),
    SERVICE("service"),
    CONTROLLER("controller"),
    ;

    private String label;

    GeneratorEnums(String label) {
        this.label = label;
    }
}
