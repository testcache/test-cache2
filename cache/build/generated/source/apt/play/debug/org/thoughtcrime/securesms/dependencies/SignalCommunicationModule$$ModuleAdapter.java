// Code generated by dagger-compiler.  Do not edit.
package org.thoughtcrime.securesms.dependencies;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class SignalCommunicationModule$$ModuleAdapter extends ModuleAdapter<SignalCommunicationModule> {
  private static final String[] INJECTS = { "members/org.thoughtcrime.securesms.jobs.CleanPreKeysJob", "members/org.thoughtcrime.securesms.jobs.CreateSignedPreKeyJob", "members/org.thoughtcrime.securesms.jobs.DeliveryReceiptJob", "members/org.thoughtcrime.securesms.jobs.PushGroupSendJob", "members/org.thoughtcrime.securesms.jobs.PushTextSendJob", "members/org.thoughtcrime.securesms.jobs.PushMediaSendJob", "members/org.thoughtcrime.securesms.jobs.AttachmentDownloadJob", "members/org.thoughtcrime.securesms.jobs.RefreshPreKeysJob", "members/org.thoughtcrime.securesms.service.MessageRetrievalService", "members/org.thoughtcrime.securesms.jobs.PushNotificationReceiveJob", "members/org.thoughtcrime.securesms.jobs.MultiDeviceContactUpdateJob", "members/org.thoughtcrime.securesms.jobs.MultiDeviceGroupUpdateJob", "members/org.thoughtcrime.securesms.jobs.MultiDeviceReadUpdateJob", "members/org.thoughtcrime.securesms.jobs.MultiDeviceBlockedUpdateJob", "members/org.thoughtcrime.securesms.DeviceListFragment", "members/org.thoughtcrime.securesms.jobs.RefreshAttributesJob", "members/org.thoughtcrime.securesms.jobs.GcmRefreshJob", "members/org.thoughtcrime.securesms.jobs.RequestGroupInfoJob", "members/org.thoughtcrime.securesms.jobs.PushGroupUpdateJob", "members/org.thoughtcrime.securesms.jobs.AvatarDownloadJob", "members/org.thoughtcrime.securesms.jobs.RotateSignedPreKeyJob", "members/org.thoughtcrime.securesms.service.WebRtcCallService", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public SignalCommunicationModule$$ModuleAdapter() {
    super(org.thoughtcrime.securesms.dependencies.SignalCommunicationModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, false /*complete*/, false /*library*/);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, SignalCommunicationModule module) {
    bindings.contributeProvidesBinding("org.whispersystems.signalservice.api.SignalServiceAccountManager", new ProvideSignalAccountManagerProvidesAdapter(module));
    bindings.contributeProvidesBinding("org.thoughtcrime.securesms.dependencies.SignalCommunicationModule$SignalMessageSenderFactory", new ProvideSignalMessageSenderFactoryProvidesAdapter(module));
    bindings.contributeProvidesBinding("org.whispersystems.signalservice.api.SignalServiceMessageReceiver", new ProvideSignalMessageReceiverProvidesAdapter(module));
  }

  /**
   * A {@code Binding<org.whispersystems.signalservice.api.SignalServiceAccountManager>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<org.whispersystems.signalservice.api.SignalServiceAccountManager>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideSignalAccountManagerProvidesAdapter extends ProvidesBinding<org.whispersystems.signalservice.api.SignalServiceAccountManager>
      implements Provider<org.whispersystems.signalservice.api.SignalServiceAccountManager> {
    private final SignalCommunicationModule module;

    public ProvideSignalAccountManagerProvidesAdapter(SignalCommunicationModule module) {
      super("org.whispersystems.signalservice.api.SignalServiceAccountManager", NOT_SINGLETON, "org.thoughtcrime.securesms.dependencies.SignalCommunicationModule", "provideSignalAccountManager");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<org.whispersystems.signalservice.api.SignalServiceAccountManager>}.
     */
    @Override
    public org.whispersystems.signalservice.api.SignalServiceAccountManager get() {
      return module.provideSignalAccountManager();
    }
  }

  /**
   * A {@code Binding<org.thoughtcrime.securesms.dependencies.SignalCommunicationModule.SignalMessageSenderFactory>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<org.thoughtcrime.securesms.dependencies.SignalCommunicationModule.SignalMessageSenderFactory>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideSignalMessageSenderFactoryProvidesAdapter extends ProvidesBinding<SignalCommunicationModule.SignalMessageSenderFactory>
      implements Provider<SignalCommunicationModule.SignalMessageSenderFactory> {
    private final SignalCommunicationModule module;

    public ProvideSignalMessageSenderFactoryProvidesAdapter(SignalCommunicationModule module) {
      super("org.thoughtcrime.securesms.dependencies.SignalCommunicationModule$SignalMessageSenderFactory", NOT_SINGLETON, "org.thoughtcrime.securesms.dependencies.SignalCommunicationModule", "provideSignalMessageSenderFactory");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<org.thoughtcrime.securesms.dependencies.SignalCommunicationModule.SignalMessageSenderFactory>}.
     */
    @Override
    public SignalCommunicationModule.SignalMessageSenderFactory get() {
      return module.provideSignalMessageSenderFactory();
    }
  }

  /**
   * A {@code Binding<org.whispersystems.signalservice.api.SignalServiceMessageReceiver>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<org.whispersystems.signalservice.api.SignalServiceMessageReceiver>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideSignalMessageReceiverProvidesAdapter extends ProvidesBinding<org.whispersystems.signalservice.api.SignalServiceMessageReceiver>
      implements Provider<org.whispersystems.signalservice.api.SignalServiceMessageReceiver> {
    private final SignalCommunicationModule module;

    public ProvideSignalMessageReceiverProvidesAdapter(SignalCommunicationModule module) {
      super("org.whispersystems.signalservice.api.SignalServiceMessageReceiver", NOT_SINGLETON, "org.thoughtcrime.securesms.dependencies.SignalCommunicationModule", "provideSignalMessageReceiver");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<org.whispersystems.signalservice.api.SignalServiceMessageReceiver>}.
     */
    @Override
    public org.whispersystems.signalservice.api.SignalServiceMessageReceiver get() {
      return module.provideSignalMessageReceiver();
    }
  }
}
