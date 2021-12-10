package com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class FuncResult {
    private String func;
    private int res;

    @Override
    public String toString() {
        return "FuncResult{" +
                "func='" + func + '\'' +
                ", res=" + res +
                '}';
    }
}
