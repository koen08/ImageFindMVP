package com.example.imagefindmvp.app.ui

abstract class AbstractService<P : BasePresenter<*>> constructor(val presenter: P) : BaseService<P> {
}