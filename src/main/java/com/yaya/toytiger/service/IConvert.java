package com.yaya.toytiger.service;

@FunctionalInterface
public interface IConvert<F,T> {

	T convert(F form);
}
