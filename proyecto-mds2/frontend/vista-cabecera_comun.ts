import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cabecera_comun')
export class VistaCabecera_comun extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; flex-direction: row; border-bottom: 1px solid black" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout id="vaadinHorizontalLayout1">
   <img style="flex-grow: 1; flex-shrink: 1; align-self: center; height: 125px; width: 125px;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout2">
   <vaadin-vertical-layout style="width: 100%; margin-top: var(--lumo-space-s); padding: var(--lumo-space-m); margin-left: var(--lumo-space-s);" id="vaadinVerticalLayout1">
    <label style="width: 100%; flex-grow: 0;" id="label">Contacto</label>
    <label style="width: 115pt; flex-grow: 0;" id="label1">Teléfono: XXXXXXXXX</label>
    <label style="width: 150pt; flex-grow: 0;" id="label2">Correo: correo@xxxxx.xxx</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="margin-top: var(--lumo-space-l); width: 100%;" id="vaadinHorizontalLayout3">
   <vaadin-horizontal-layout style="margin: var(--lumo-space-m);" id="vaadinHorizontalLayout4">
    <vaadin-text-field placeholder="Search" style="width: 100%;" id="vaadinTextField">
     <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
    </vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; margin: var(--lumo-space-m);" id="vaadinHorizontalLayout5">
    <vaadin-button style="width: 100%;" id="vaadinButton">
      Registrarse 
    </vaadin-button>
    <vaadin-button style="width: 100%;" id="vaadinButton1">
      Iniciar Sesión 
    </vaadin-button>
    <vaadin-button style="width: 100%;" id="vaadinButton2">
      Administración 
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100%;" id="vaadinButton3">
     <iron-icon src="https://w7.pngwing.com/pngs/141/637/png-transparent-computer-icons-notifications-cdr-area-sound-icon.png" id="ironIcon1"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100%;" id="vaadinButton4">
     <iron-icon src="https://w7.pngwing.com/pngs/356/700/png-transparent-computer-icons-user-profile-encapsulated-postscript-profile-heroes-monochrome-computer-wallpaper.png" id="ironIcon2"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100%;" id="vaadinButton5">
     <iron-icon src="https://www.pngfind.com/pngs/m/339-3396821_png-file-svg-download-icon-logout-transparent-png.png" id="ironIcon3"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
