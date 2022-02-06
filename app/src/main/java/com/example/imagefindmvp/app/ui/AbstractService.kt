package com.example.imagefindmvp.app.ui

abstract class AbstractService<P : BasePresenter<*>> : BaseService<P> {
    lateinit var presenter: BasePresenter<*>
    override fun attach(presenter: P) {
        this.presenter = presenter
    }
}