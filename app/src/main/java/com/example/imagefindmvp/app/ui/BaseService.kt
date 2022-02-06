package com.example.imagefindmvp.app.ui

interface BaseService<P: BasePresenter<*>> {
    fun attach(presenter: P)
}