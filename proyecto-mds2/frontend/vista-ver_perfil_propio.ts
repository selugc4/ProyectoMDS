import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_perfil_propio')
export class VistaVer_perfil_propio extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 40%; padding: var(--lumo-space-xl);">
  <img style="width: 25%;" src="https://us.123rf.com/450wm/thesomeday123/thesomeday1231712/thesomeday123171200009/91087331-icono-de-perfil-de-avatar-predeterminado-para-hombre-marcador-de-posici%C3%B3n-de-foto-gris-vector-de-ilu.jpg?ver=6">
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-self: center;">
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; width: 100%; justify-content: flex-start;">
    <label style="align-self: center; font-size:35px">Nombre del usuario</label>
    <vaadin-horizontal-layout theme="spacing" style="width: 30%; justify-content: flex-end;">
     <vaadin-button style="align-self: center;">
      Darse de baja
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <label>Seguidores: XXXX</label>
   <label>Seguidos: XXXX</label>
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 75%;">
    <label style="margin-right: var(--lumo-space-xl);">Correo:</label>
    <vaadin-text-field placeholder="Correo" style="margin-right: var(--lumo-space-xl);">
     Correo
    </vaadin-text-field>
    <vaadin-button theme="icon" aria-label="Add new">
     <iron-icon src="https://img2.freepng.es/20180509/tue/kisspng-computer-icons-tick-tick-clip-art-5af2d059174288.6894910715258624890953.jpg"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" style="width: 10%;">
     <iron-icon src="https://e7.pngegg.com/pngimages/557/991/png-clipart-computer-icons-setting-icon-desktop-wallpaper-android.png"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); width: 100%;">
  <vaadin-button theme="icon" aria-label="Add new">
   <iron-icon src="https://e7.pngegg.com/pngimages/557/991/png-clipart-computer-icons-setting-icon-desktop-wallpaper-android.png"></iron-icon>
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new">
   <iron-icon src="https://img2.freepng.es/20180509/tue/kisspng-computer-icons-tick-tick-clip-art-5af2d059174288.6894910715258624890953.jpg"></iron-icon>
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" style="width: 54%; justify-content: flex-end;">
   <vaadin-button>
    Ver lista de favoritos 
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
