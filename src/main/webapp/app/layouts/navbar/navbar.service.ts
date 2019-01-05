import { EventEmitter, Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})
export class NavbarService {
    public courses = 0;
    public check = false;

    shouldCheck() {
        this.check = true;
    }

    donotCheck() {
        this.check = false;
    }

    increment() {
        this.courses++;
    }

    decrement() {
        this.courses--;
    }

    initialize() {
        this.courses = 0;
    }

    setNum(courNum: number) {
        this.courses = courNum;
    }
}
