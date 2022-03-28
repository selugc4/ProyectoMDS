import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `my-view2`
 *
 * MyView2 element.
 *
 * @customElement
 * @polymer
 */
class MyView2 extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'my-view2';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(MyView2.is, MyView2);
