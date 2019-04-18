import { Injectable } from '@angular/core';
import { CookieService } from 'ngx-cookie';

@Injectable({ providedIn: '_root.graphqls' })
export class CSRFService {
    constructor(private cookieService: CookieService) {}

    getCSRF(name = 'XSRF-TOKEN') {
        return this.cookieService.get(name);
    }
}
