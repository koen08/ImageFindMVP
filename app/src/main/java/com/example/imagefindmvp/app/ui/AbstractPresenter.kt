package com.example.imagefindmvp.app.ui

abstract class AbstractPresenter<V : BaseView> constructor(val view: V) : BasePresenter<V> {
}