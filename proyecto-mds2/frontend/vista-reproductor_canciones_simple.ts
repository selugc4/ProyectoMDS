import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-reproductor_canciones_simple')
export class VistaReproductor_canciones_simple extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: space-between; align-items: center;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing">
    <img style="width: 125px; height: 125px;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <label style="font-size: 15pt; height: 100%;" font-size="">Titulo de canción </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <label style="margin-top: var(--lumo-space-xs);">xx:xx/xx:xx</label>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%; align-items: center; margin-left: var(--lumo-space-xl);">
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://cdn.discordapp.com/attachments/689232198712426506/953324245390344312/2413625.png"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://w7.pngwing.com/pngs/689/324/png-transparent-back-direction-music-play-previous-rounded-song-play-rounded-icon-thumbnail.png"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://e7.pngegg.com/pngimages/807/619/png-clipart-number-computer-icons-pausebutton-text-trademark-thumbnail.png"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://w7.pngwing.com/pngs/416/711/png-transparent-computer-icons-play-angle-triangle-black.png"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://cdn.discordapp.com/attachments/689232198712426506/953326545689260062/descarga.jpg"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://cdn.discordapp.com/attachments/689232198712426506/953324531932610630/2413625.png"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; height: 100%; width: 50%;">
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-button theme="icon" aria-label="Add new">
     <iron-icon src="https://w7.pngwing.com/pngs/529/205/png-transparent-for-loop-infinite-loop-computer-science-computer-icons-loop-miscellaneous-angle-text-thumbnail.png"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 35px; height: 35px; align-items: center;">
    <img style="height: 100%;" src="https://e7.pngegg.com/pngimages/518/845/png-clipart-black-volume-icon-computer-icons-volume-sound-icon-sound-miscellaneous-blue.png">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 50%;">
    <vaadin-progress-bar style="height: 15px; width: 100%;"></vaadin-progress-bar>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; margin-right: var(--lumo-space-xl);">
   <vaadin-button>
    Ver créditos
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
