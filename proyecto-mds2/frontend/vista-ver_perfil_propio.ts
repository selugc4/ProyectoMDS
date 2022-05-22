import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 40%; padding: var(--lumo-space-xl);" id="vaadinHorizontalLayout">
  <img style="width: 25%;" src="https://us.123rf.com/450wm/thesomeday123/thesomeday1231712/thesomeday123171200009/91087331-icono-de-perfil-de-avatar-predeterminado-para-hombre-marcador-de-posici%C3%B3n-de-foto-gris-vector-de-ilu.jpg?ver=6" id="img">
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-self: center;" id="vaadinVerticalLayout1">
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; width: 100%; justify-content: flex-start;" id="vaadinHorizontalLayout1">
    <label style="align-self: center; font-size:35px" id="label">Nombre del usuario</label>
    <vaadin-horizontal-layout theme="spacing" style="width: 30%; justify-content: flex-end;" id="vaadinHorizontalLayout2">
     <vaadin-button style="align-self: center;" id="vaadinButton">
       Darse de baja 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <label id="label1">Seguidores: XXXX</label>
   <label id="label2">Seguidos: XXXX</label>
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 75%;" id="vaadinHorizontalLayout3">
    <label style="margin-right: var(--lumo-space-xl);" id="label3">Correo:</label>
    <vaadin-text-field placeholder="Correo" style="margin-right: var(--lumo-space-xl);" id="vaadinTextField">
      Correo 
    </vaadin-text-field>
    <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1">
     <iron-icon src="https://img2.freepng.es/20180509/tue/kisspng-computer-icons-tick-tick-clip-art-5af2d059174288.6894910715258624890953.jpg" id="ironIcon"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" style="width: 10%;" id="vaadinButton2">
     <iron-icon src="https://e7.pngegg.com/pngimages/557/991/png-clipart-computer-icons-setting-icon-desktop-wallpaper-android.png" id="ironIcon1"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); width: 100%; flex-shrink: 1;" id="vaadinHorizontalLayout4">
  <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton3">
   <iron-icon src="https://e7.pngegg.com/pngimages/557/991/png-clipart-computer-icons-setting-icon-desktop-wallpaper-android.png" id="ironIcon2"></iron-icon>
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton4">
   <iron-icon src="https://img2.freepng.es/20180509/tue/kisspng-computer-icons-tick-tick-clip-art-5af2d059174288.6894910715258624890953.jpg" id="ironIcon3"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout5" style="width: 100%; justify-content: flex-end;">
  <vaadin-button id="vaadinButton5" style="flex-shrink: 1; margin-right: var(--lumo-space-xl);">
    Ver lista de favoritos 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="verticalContenedores" style="width: 100%; height: 100%; padding: var(--lumo-space-l);">
  <vaadin-horizontal-layout theme="spacing" id="horizontalListas" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" id="verticalSusListas" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="verticalListasSusCanciones" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="horizontalAlbumes" style="width: 100%; height: 100%; align-self: center; justify-content: center; align-items: center;"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="horizontalCanciones" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" id="verticalExitosas" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="verticalConciertos" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="horizontalArtistas" style="width: 100%; height: 100%; flex-direction: row; align-self: center; align-items: center; justify-content: center;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
