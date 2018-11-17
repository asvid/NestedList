package io.github.asvid.nestedlist.utils

import io.reactivex.Scheduler

interface RxSchedulers {

  fun androidUI(): Scheduler

  fun io(): Scheduler

  fun computation(): Scheduler

  fun network(): Scheduler

  fun background(): Scheduler
}