import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row;">
 <vaadin-horizontal-layout style="width: 10%; height: 15%;">
  <img style="flex-grow: 1; flex-shrink: 1; align-self: center; height: 100%; width: 100%;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout>
  <vaadin-vertical-layout style="width: 100%; margin-top: var(--lumo-space-s); padding: var(--lumo-space-m); margin-left: var(--lumo-space-s);">
   <label style="width: 100%; flex-grow: 0;">Contacto</label>
   <label style="width: 115pt; flex-grow: 0;">Teléfono: XXXXXXXXX</label>
   <label style="width: 150pt; flex-grow: 0;">Correo: correo@xxxxx.xxx</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="margin-top: var(--lumo-space-l);">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m);">
   <vaadin-text-field placeholder="Search" style="width: 100%;">
    <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
   </vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin: var(--lumo-space-m);">
   <vaadin-button>
     Registrarse 
   </vaadin-button>
   <vaadin-button>
     Iniciar Sesión 
   </vaadin-button>
   <vaadin-button>
     Administración 
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://w7.pngwing.com/pngs/141/637/png-transparent-computer-icons-notifications-cdr-area-sound-icon.png"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://w7.pngwing.com/pngs/356/700/png-transparent-computer-icons-user-profile-encapsulated-postscript-profile-heroes-monochrome-computer-wallpaper.png"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://www.pngfind.com/pngs/m/339-3396821_png-file-svg-download-icon-logout-transparent-png.png"></iron-icon>
   </vaadin-button>
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
