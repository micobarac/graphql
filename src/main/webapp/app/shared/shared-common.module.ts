import { NgModule } from '@angular/core';

import { GraphqlSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [GraphqlSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [GraphqlSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class GraphqlSharedCommonModule {}
